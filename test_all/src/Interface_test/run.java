
package Interface_test;

abstract class run{
    String ten;
      abstract  void chay();

    public run(String ten) {
        this.ten = ten;
    }

    public run() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "run{" + "ten=" + ten + '}';
    }
      
}
