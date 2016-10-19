package Test;

import Model.User;
import Utils.LinkedListStack;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LazEness on 10/12/2016.
 */
public class LinkedListStackTest {
    LinkedListStack<User> list = new LinkedListStack<User>();
    @Test
    public void push() throws Exception {
        User Tanner = new User("Tanner", "pass2");
        User Sam = new User("Sam", "pass1");
        User Jack = new User("Jack", "pass3");
        User Wit = new User("Wit", "pass4");

        list.push(Sam);
        list.push(Jack);
        list.push(Tanner);
        list.push(Wit);

        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void pop() throws Exception {
        User Tanner = new User("Tanner", "pass2");
        User Sam = new User("Sam", "pass1");
        User Jack = new User("Jack", "pass3");
        User Wit = new User("Wit", "pass4");

        list.push(Sam);
        list.push(Jack);
        list.push(Tanner);
        list.push(Wit);

        list.pop();
        list.pop();
        list.pop();
        list.pop();

        Assert.assertFalse(list.isEmpty());
    }


    @Test
    public void top() throws Exception {
        User Tanner = new User("Tanner", "pass2");
        User Sam = new User("Sam", "pass1");
        User Jack = new User("Jack", "pass3");
        User Wit = new User("Wit", "pass4");

        list.push(Sam);
        list.push(Jack);
        list.push(Tanner);
        list.push(Wit);

        Assert.assertTrue(list.top().equals(Wit));
    }

    @Test
    public void isEmpty() throws Exception {
        User Tanner = new User("Tanner", "pass2");
        list.push(Tanner);
        Assert.assertFalse(list.isEmpty());
    }



    @Test
    public void size() throws Exception {
        User Tanner = new User("Tanner", "pass2");
        User Sam = new User("Sam", "pass1");
        User Jack = new User("Jack", "pass3");
        User Wit = new User("Wit", "pass4");

        list.push(Sam);
        list.push(Jack);
        list.push(Tanner);
        list.push(Wit);
        Assert.assertTrue(list.size()==4);
    }

}