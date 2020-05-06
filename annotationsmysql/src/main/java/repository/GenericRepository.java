package repository;
import model.mysql.Column;
import model.mysql.MySQLObjectException;
import model.mysql.Table;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Objects;

public class GenericRepository {
    private Object object;

    public static GenericRepository useObject(Object object)
    {
        checkIfMySQLObject(object);
        return new GenericRepository(object);
    }

    private GenericRepository(Object object)
    {
        this.object = object;
    }

    public String getSelectQuery()
    {
        String sql = "SELECT ";
        Class<?> myClass = object.getClass();
        Table table = myClass.getAnnotation(Table.class);

        Annotation[] obj = myClass.getAnnotations();
        for (Annotation a : obj)
        {
            System.out.println(a.annotationType());
            System.out.println(a.toString());
        }

        if (myClass.getSuperclass() != null) {
            for (Field field : myClass.getSuperclass().getDeclaredFields()) {
                field.setAccessible(true);
                Column column = field.getAnnotation(Column.class);
                if (sql == "SELECT ")
                    sql += column.name();
                else
                    sql += ", " + column.name();
            }
        }
        for (Field field : myClass.getDeclaredFields()) {
            field.setAccessible(true);
            Column column = field.getAnnotation(Column.class);
            if (sql == "SELECT ")
                sql += column.name();
            else
                sql += ", " + column.name();
        }

        sql += " FROM " + table.name() + ";";
        return sql;
    }

    private static void checkIfMySQLObject(Object object) throws MySQLObjectException {
        if (Objects.isNull(object)) {
            throw new MySQLObjectException("The object to serialize is null");
        }

        Class<?> clazz = object.getClass();
        if (!clazz.isAnnotationPresent(Table.class)) {
            throw new MySQLObjectException("The class " + clazz.getSimpleName() + " is not annotated with model.mysql package");
        }
    }
}
