package view;

public class PhoneInheritance {

    public static void main(String[] args) {
        System.out.println("-------휴대전화--------");
        Phone phone = new Phone();
        phone.setCall("제임스");
        phone.setCompany("금성");
        System.out.println(phone.toString());
        System.out.println("-------휴대전화--------");
        CellPhone cp = new CellPhone();
        cp.setCompany("노키아");
        cp.setCall("에릭");
        cp.setPortable(true);
        System.out.println(cp.toString());
        System.out.println("-------아이폰----------");
        IPhone iPhone = new IPhone();
        iPhone.setCompany("애플");
        iPhone.setCall("톰");
        iPhone.setData("전송하다");
        iPhone.setPortable(true);
        System.out.println(iPhone); // 애플 아이폰으로 톰에게 데이터를 전송하다.폰을 휴대 할 수 있음.
        System.out.println("-------갤럭시----------");
        AndroidPhone adroid = new AndroidPhone();
        adroid.setCompany("삼성");
        adroid.setCall("이재용");
        adroid.setData("전송하다");
        adroid.setPortable(true);
        adroid.setSize("10인치이다.");
        System.out.println(adroid);

        // 삼성 갤릭서노트로 제인에게 폰을 휴대 할 수 있음 / 데이터를 전송하자.

    }
}

class AndroidPhone extends IPhone{

    private String size;

    public static String BRAND = "갤럭시노트";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "<갤럭시노트>" +
                "\n 제조사 = '" + company + '\''
                + BRAND + '\'' +
                "\n 데이터 = '" + data + '\'' +
                "\n 수신자 = '" + call + '\'' +
                "\n 이동성 = " + portable +
                "\n 이동유무 = '" + move + '\'' ;

    }
}
class IPhone extends CellPhone{

    protected String data;

    public static String BRAND = "iPhone";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "<아이폰>" +
                "\n 제조사 = '" + super.company + '\'' + BRAND + '\'' +
                "\n 데이터 = '" + data + '\'' +
                "\n 수신자 = '" + super.call + '\'' +
                "\n 이동성 = " + super.portable +
                "\n 이동유무 = '" + super.move + '\'' ;
    }
}



class CellPhone extends Phone{
    protected boolean portable; // 이동성, 휴대가능

    protected String move;

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        if(portable){
            this.setMove("폰을 휴대 할 수 있음");

        }else{
            this.setMove("폰을 휴대 할 수 없음");
        }
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {

        this.move = move;
    }

    @Override
    public String toString() {
        return "<휴대폰>" +
                "\n 제조사 = '" + super.company + '\'' +
                "\n 수신자 = '" + super.call + '\'' +
                "\n 이동성 = " + portable +
                "\n 이동유무 = '" + move + '\'' ;
    }
}

//한 클래스에 여러개의 클래스가 존재 가능하나 "public"은 하나만 붙어야함.
class Phone{
    protected String company, call; // 인스턴스 변수 = 멤버변수 => 힙 영역
    static final double TAX_RATE = 0.095; //스태틱 변수 = 전역변수 => 스태틱 영역
    // static을 붙이면 상수가 된다. (상수자체는 바뀔 수 있지만 final을 붙이면 불변)

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company + "에서 제작하다";
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call + "에게 전화를 걸다";
    }

    @Override
    public String toString() {
        return "<집전화>" +
                "\n 제조사 = '" + company + '\'' +
                "\n 수신자 = '" + call + '\'' ;
    }
}
