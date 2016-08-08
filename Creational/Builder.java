class People {
    private String name;
    private Integer age;
    private String hobby;

    static class Builder {
        private String name;
        private Integer age;
        private String hobby;

        Builder(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        Builder hobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        People build() {
            if (name == null || age == null) {
                throw new NullPointerException();
            }
            return new People(this);
        }
    }

    private People(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.hobby = builder.hobby;
    }

    String hello() {
        //...
    }
}

// new People.Builder("Tom", 12).hobby("BaseBall").build().hello();
