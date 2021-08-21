@Test
    void contextLoads() {

        List<Menu> menus = menuDao.queryAll();

        menus.forEach(menu -> System.out.println(menu));

    }
