import java.util.List;

public class szolobirtok {
    private List<parcella> parcellaList;

    public szolobirtok(List<parcella> parcellaList) {
        this.parcellaList = parcellaList;
    }

    public List<parcella> getParcellaList() {
        return parcellaList;
    }

    public void setParcellaList(List<parcella> parcellaList) {
        this.parcellaList = parcellaList;
    }

    @Override
    public String toString() {
        return "parcellaList=" + parcellaList;
    }
    public void hozzaad(List<parcella> parcella){
        parcella.add((parcella) parcellaList);
    }

    public szolobirtok() {
    }
    public void SetTermesiAdat(int hely,parcella newparcella) {
    for (int i=0;i<parcellaList.size();i++){
        if (hely == this.parcellaList.get(i).getHelyrajziszam()){
            this.parcellaList.get(i).setEvestermes(newparcella.getEvestermes());
            this.parcellaList.get(i).setSzolofajta(newparcella.getSzolofajta());
            this.parcellaList.get(i).setHelyrajziszam(newparcella.getHelyrajziszam());
            this.parcellaList.get(i).setTokeszam(newparcella.getTokeszam());
        }
    }

    }
}
