package top.tomxwd.test.builder;

/**
 * 构造者，在builder
 * @author xwd
 */
public class User {

    private String name;
    private String password;
    private String nickName;
    private int age;

    /**
     * 构造器私有化 否则客户端可以直接调用构造方法
     *
     * @param name
     * @param password
     * @param nickName
     * @param age
     */
    private User(String name, String password, String nickName, int age) {
        this.name = name;
        this.password = password;
        this.nickName = nickName;
        this.age = age;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        /**
         * 下面的属性和User一致
         */
        private String name;
        private String password;
        private String nickName;
        private int age;

        /**
         * 链式调用 设置各个属性，返回this=>builder
         *
         * @param name
         *
         * @return
         */
        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        /**
         * 核心方法，在这里 创建User之前，可以进行各种操作
         *
         * @return
         */
        public User build() {
            if (name == null || password == null) {
                throw new RuntimeException("用户名和密码必填");
            }
            if (age <= 0 || age >= 150) {
                throw new RuntimeException("年龄不合法");
            }
            // 还可以赋默认值
            if (nickName == null) {
                nickName = name;
            }
            return new User(name, password, nickName, age);
        }

    }

}
