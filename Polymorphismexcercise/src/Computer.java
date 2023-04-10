public class Computer extends Product{
    private ComputerCase computerCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public Computer(String model, String manufacturer, ComputerCase computerCase, MotherBoard motherBoard, Monitor monitor) {

        super(model, manufacturer);
        this.computerCase = computerCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }
    private void drawLogo()
    {
        monitor.draw(12,12,"Red");
    }
    private void powerup()
    {
        computerCase.press();
        drawLogo();
    }
}
