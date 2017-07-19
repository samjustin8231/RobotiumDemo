package com.example.sam.myapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by sam on 2017/7/18.
 * <p>
 * Android自动测试沿用Java中的JUnit
 * 创建测试类的时候，继承 ActivityInstrumentationTestCase2<MainActivity> 即可。其中MainActivity为测试时进入的首个界面。
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private Solo solo;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @BeforeClass
    public void setUp() throws Exception {
        super.setUp();
        //初始化solo  getActivity：启动activity
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @AfterClass
    protected void tearDown() throws Exception {
        //结束aictivity
        solo.finishOpenedActivities();
        super.tearDown();
    }

    /**
     * 测试方法必须以testXXX命名
     */
    @Test
    public void testShowText() {
        Assert.assertTrue(solo.searchText("+"));
    }

    @Test
    public void testAddTest() {
        //等待timeout毫秒一个名字为name的Activity启动
        solo.waitForActivity("MainActivity", 1000);

        /*num1*/
        //清空EditText的内容
        solo.clearEditText((EditText) solo.getView(R.id.etNum1));
        //输入内容
        solo.enterText((EditText) solo.getView(R.id.etNum1), "1");

        //num2
        solo.clearEditText((EditText) solo.getView(R.id.etNum2));
        solo.enterText((EditText) solo.getView(R.id.etNum2), "1");

        //根据按钮上的文字点击按钮
        solo.clickOnButton("=");

        //根据按钮上的文字点击按钮
        solo.sleep(3000);
    }

}
