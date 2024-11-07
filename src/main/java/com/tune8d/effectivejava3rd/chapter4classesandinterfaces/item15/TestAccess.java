package com.tune8d.effectivejava3rd.chapter4classesandinterfaces.item15;


/*

//언어별 나오는 신기술은 자신이 희망하는 프레임워크에 대해 호환 여부를 판단하고 접근할것.
https://www.google.com/search?q=spring+framework+java+9+modules&newwindow=
1&sca_esv=a0b6cc145a6c8085&rlz=1C1GCEA_enKR970KR970&ei=oiEsZ437Meuu0-kP3Y29-AY&oq=
java+9+spring&gs_lp=Egxnd3Mtd2l6LXNlcnAiDWphdmEgOSBzcHJpbmcqAggAMgYQABgIGB4yBhAAGAg
YHjIGEAAYCBgeMgYQABgIGB4yCBAAGIAEGKIEMggQABiiBBiJBTIIEAAYgAQYogQyCBAAGIAEGKIESPMiUABYoBlwAngBkAEAmAF
-oAHYC6oBAzguN7gBA8gBAPgBAZgCEaAChgzCAgoQABiABBhDGIoFwgIFEAAYgATCAggQABiABBixA8ICBxAAGIAEGBPCAgkQABiABBgTGArCAgYQABgTGB7CAgQQABgewgIGEAAYBRgewgIJEAAYgAQYExgNwgIKEAAYExgIGA0YHsICBRAhGKABwgIEECEYFZgDAJIHAzkuOKAHwks&sclient=gws-wiz-serp
* */
public class TestAccess {
    private int num;
    private String name;

    public static class Builder{

        // Required parameter
        private final int num;

        // Optional parameter
        private String name = null;

        public Builder(int num){
            this.num = num;
        }

        public Builder name(String val){
            name = val;
            return this;
        }

        public TestAccess build(){
            return new TestAccess(this);
        }
    }

    private TestAccess(Builder builder){
        num = builder.num;
        name = builder.name;
    }

    // 테스트하고 싶은 private 함수 -> 코드 로직 그대로 테스트에 구현해서 진행한다.
    public void getData(){
        System.out.println(num);
        System.out.println(name);
    }
}
