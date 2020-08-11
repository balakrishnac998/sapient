package com.sapient.week1;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
public class AppTest
{
@Test
public void test1()
{
assertThat(App.check(2),is(true));

}
@Test
public void test2()
{
assertThat(App.check(4),is(true));

}

@Test
public void test3()
{
assertThat(App.check(6),is(true));

}
@Test
public void test4()
{
assertThat(App.check(7),is(false));

}
}