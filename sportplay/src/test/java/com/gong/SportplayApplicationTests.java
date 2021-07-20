package com.gong;

import com.gong.pojo.User;
import com.gong.service.MenuService;
import com.gong.service.SportService;
import com.gong.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SportplayApplicationTests {


    @Autowired
    private UserService userService;
    @Autowired
    private MenuService menuService;
    @Autowired
    private SportService sportService;

    @Test
    void contextLoads() {

    }

    @Test
    public void test(){
        System.out.println(menuService.getMenus());
    }

    @Test
    public void getAllUser(){
        System.out.println(userService.getAllUser());
    }


    @Test
    public void testUpdate(){
        userService.updateState(1,false);
    }

    @Test
    public void testSelectByName(){
        System.out.println(userService.getPage("admin", 1, 6));
    }

    @Test
    public void getUserById(){
        System.out.println(userService.getUserById(1));
    }
    @Test
    public void getTypeList(){
        System.out.println(sportService.getSportList("跑步机", 1, 1));
    }
}
