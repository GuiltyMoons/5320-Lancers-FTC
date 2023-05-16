package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.vuforia.HINT;
import com.vuforia.Vuforia;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.matrices.OpenGLMatrix;
import org.firstinspires.ftc.robotcore.external.matrices.VectorF;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackableDefaultListener;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackables;


  /* Created by cao on 11/28/2016.


public class VuforiaOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();

        VuforiaLocalizer.Parameters params = new VuforiaLocalizer.Parameters(R.id.cameraMonitorViewId);
        params.cameraDirection = VuforiaLocalizer.CameraDirection.BACK;
        params.vuforiaLicenseKey =;
        params.cameraMonitorFeedback = VuforiaLocalizer.Parameters.CameraMonitorFeedback.AXES;

        VuforiaLocalizer vuforia = ClassFactory.createVuforiaLocalizer(params);
        Vuforia.setHint((HINT.HINT_MAX_SIMULTANEOUS_IMAGE_TARGETS, 4);

        //GETS THE IMAGE TO TRACK
        VuforiaTrackables images = vuforia.loadTrackablesFromAsset("FTC_2016-17");
        images.get(0).setName("Wheels");
        images.get(1).setName("Tools");
        images.get(2).setName("Lego");
        images.get(3).setName("Gears");

        waitForStart();

        images.activate();

        while (opModeIsActive()) {
            for(VuforiaTrackable picture : images) {
                OpenGLMatrix pose = ((VuforiaTrackableDefaultListener)picture.getListener()).getPose();

                if(pose != null);
                VectorF translation = pose.getTranslation();
                telemetry.addData(picture.getName(), translation);

                double degreesToTurn =Math.toDegrees(Math.atan2(translation.get(1), translation.get(2)));

                telemetry.addData(picture.getName() + "-Degrees", degreesToTurn);
            }
        }
        telemetry.update();
    }
}
*/