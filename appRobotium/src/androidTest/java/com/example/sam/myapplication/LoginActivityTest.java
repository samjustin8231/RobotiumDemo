package com.example.sam.myapplication;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by sam on 2017/7/19.
 */
public class LoginActivityTest {
    @Rule
    // 注解定义规则
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    // 测试用例
    public void test() throws InterruptedException {

        // 清除 之前输入点用户名和密码

        onView(withId(R.id.etUserName)).perform(clearText());

        onView(withId(R.id.etPassword)).perform(clearText());

        // 输入用户名和密码并关闭软键盘

        onView(withId(R.id.etUserName)).perform(typeText("18500000000\n"), closeSoftKeyboard());
        Thread.sleep(1000);

        onView(withId(R.id.etPassword)).perform(typeText("wjf"),closeSoftKeyboard());

        Thread.sleep(3000);

        // 触发登录按钮的点击事件

        onView(withId(R.id.btnLogin)).perform(click());

        //通过断言判断是否登录成功，这里通过会话列表是否显示来判断
        //onView(withText("登陆失败")).check(ViewAssertions.matches(isDisplayed()));

    }
}