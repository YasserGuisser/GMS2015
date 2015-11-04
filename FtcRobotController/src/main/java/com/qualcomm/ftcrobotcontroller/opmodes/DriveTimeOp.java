public class DriveTimeOp extends OpMode {
  
  double time;
  double distance;
  double velocity;
  
  
  @Override
  public void init() {
    time = distance / velocity;
    DcMotor leftMotor = time / distance
    DcMotor rightMotor = time / distance
    leftMotor = hardwareMap.dcMotor.get("left_drive");
    rightMotor = hardwareMap.dcMotor.get("left_drive");
    
    rightMotor.setDirection(DcMotor.Direction.REVERSE);
    leftMotor.setDirection(DcMotor.Direction.REVERSE);
    
    rightMotor.setPower(1);
    leftMotor.setPower(1);
    
    ElapsedTime timer = new ElapsedTime();
  }

  @Override 
  public void loop() {
  
    if(timer.time() >= time) {
      set power (0)
    }

  }
}
