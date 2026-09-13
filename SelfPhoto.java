import java.io.IOException;

public class SelfPhoto
{
    public static void main(String[] args)
	{
        System.out.println("Initializing system camera request...");
        System.out.println("Taking snapshot in 2 seconds... Get ready!");

        try {
            Thread.sleep(2000);
            Process process = Runtime.getRuntime().exec("CommandCam.exe /filename my_selfie.png");
            // 3. Wait for the camera to finish capturing
            int exitCode = process.waitFor();

            if (exitCode == 0)
			{
                System.out.println("SUCCESS! Your photo has been saved as 'my_selfie.png' inside your folder.");
            }
			else
			{
                System.out.println("Camera execution returned an error code: " + exitCode);
            }

        }
		catch (InterruptedException e)
		{
            System.out.println("Timer delay was interrupted.");
        }
		catch (IOException e)
		{
            System.out.println("Error: Could not find or execute CommandCam.exe in this folder.");
            System.out.println("Make sure CommandCam.exe is placed inside E:\\Java_Codes\\ReadCamera\\The App");
			System.out.println(e.getMessage());
        }
    }
}
