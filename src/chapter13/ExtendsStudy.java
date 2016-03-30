package chapter13;

public class ExtendsStudy {

    public static void main(String[] args) {
        // 左辺と右辺が同じ型
        System.out.println("- 左辺と右辺が同じ型 ---------");

        System.out.println("- ここから o ---------");
        Oya o = new Oya();
        System.out.println("- o.num ---------");
        System.out.println(o.num);
        System.out.println(o.NUM2);
        // メソッド呼び出し (コンパイルエラーが発生する箇所あり)
        o.aaa();
//        o.bbb();
//        o.ccc();
        o.ddd();
        o.eee();
//        o.fff();
        o.ggg();
        System.out.println("- ここまで o ---------");

        System.out.println("- ここから k ---------");
        Ko k = new Ko();
        System.out.println("- k.num ---------");
        System.out.println(k.num);
        System.out.println(k.NUM2);
        // メソッド呼び出し (コンパイルエラーが発生する箇所あり)
        k.aaa();
        k.bbb();
//        k.ccc();
        k.ddd();
        k.eee();
        k.fff();
        k.ggg();
        System.out.println("- ここまで k ---------");

        System.out.println("- ここから m ---------");
        Mago m = new Mago();
        System.out.println("- m.num ---------");
        System.out.println(m.num);
        System.out.println(m.NUM2);
        // メソッド呼び出し (コンパイルエラーが発生する箇所あり)
        m.aaa();
        m.bbb();
        m.ccc();
        m.ddd();
        m.eee();
        m.fff();
        m.ggg();
        System.out.println("- ここまで m ---------");

        System.out.println();

        // 左辺があいまいな型
        System.out.println("- 左辺があいまいな型 ---------");

        System.out.println("- ここから ok ---------");
        Oya ok = new Ko();
        System.out.println("- ok.num ---------");
        System.out.println(ok.num);
        System.out.println(ok.NUM2);
        // メソッド呼び出し (コンパイルエラーが発生する箇所あり)
        ok.aaa();
//        ok.bbb();
//        ok.ccc();
        ok.ddd();
        ok.eee();
//        ok.fff();
        ok.ggg();
        System.out.println("- ここまで ok ---------");

        System.out.println("- ここから om ---------");
        Oya om = new Mago();
        System.out.println("- om.num ---------");
        System.out.println(om.num);
        System.out.println(om.NUM2);
        // メソッド呼び出し (コンパイルエラーが発生する箇所あり)
        om.aaa();
//        om.bbb();
//        om.ccc();
        om.ddd();
        om.eee();
//        om.fff();
        om.ggg();
        System.out.println("- ここまで om ---------");

        System.out.println("- ここから km ---------");
        Ko km = new Mago();
        System.out.println("- km.num ---------");
        System.out.println(km.num);
        System.out.println(km.NUM2);
        // メソッド呼び出し (コンパイルエラーが発生する箇所あり)
        km.aaa();
        km.bbb();
//        km.ccc();
        km.ddd();
        km.eee();
        km.fff();
        km.ggg();
        System.out.println("- ここまで km ---------");

        System.out.println("- staticフィールドにクラス型でアクセスする ---------");
        System.out.println(Oya.NUM2);
        System.out.println(Ko.NUM2);
        System.out.println(Mago.NUM2);
    }

}