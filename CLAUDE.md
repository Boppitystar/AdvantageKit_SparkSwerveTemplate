# AdvantageKit_SparkSwerveTemplate

FRC robot code for [team/robot name] — swerve drivetrain, WPILib + AdvantageKit.

## Build & deploy (DO NOT TOUCH WHEN EDITING)
- Build: `./gradlew build`
- Run tests: `./gradlew test`
- Deploy to robot: `./gradlew deploy` (robot must be on network, roboRIO at 10.TE.AM.2)
- Simulate: use WPILib "Simulate Robot Code" in VS Code, or `./gradlew simulateJava`

## Structure
- `src/main/java/frc/robot/subsystems/<name>/` — one folder per subsystem
  - Each subsystem follows the AdvantageKit IO pattern: `<Name>.java` (subsystem logic),
    `<Name>IO.java` (hardware interface), `<Name>IOSpark.java`/`<Name>IOSim.java` (real/sim implementations)
- `src/main/java/frc/robot/Constants.java` — tunable constants, port assignments
- `src/main/java/frc/robot/RobotContainer.java` — subsystem wiring, controller bindings

## Conventions
- New subsystems must implement intake or shooter style following the method-to-command pattern that gets linked into a higher combined command — see `DriveCommand.java`
- Motor/controller ports live in `Constants.java`, never inline

## Do not touch
- `src/main/java/frc/robot/BuildConstants.java` — auto-generated at build time, changes are overwritten
- `vendordeps/` — managed via WPILib VS Code extension "Manage Vendor Libraries", not hand-edited
- `Main.java`, `Robot.java`
- `AdvantageScope Swerve Calibration.json`
- `build.gradle`, `gradlew`, `gradlew.bat`
- `networktables.json`
