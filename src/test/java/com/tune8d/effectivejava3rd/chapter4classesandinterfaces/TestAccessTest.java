package com.tune8d.effectivejava3rd.chapter4classesandinterfaces;

import com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item15.TestAccess;
import org.junit.Test;

public class TestAccessTest {

    @Test
    public void testData(){
        // 다른 패키지의 default 클래스를 접근 가능?
        TestAccess ta = new TestAccess.Builder(1).name("aa").build();
        ta.getData();
    }
    // 테스트하고 싶은 함수는 테스트 창에 복붙해서 진행한다.
    // Spring 에는 이런 경우가 있는데, 그럴때는 @ 로 해결 가능.
    /*
    void getData(){
        System.out.println(num);
        System.out.println(name);
    }
    */

}