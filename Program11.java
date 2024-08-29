interface MediaPlayer{
	void play();
	void pause();
	void stop();
}

class AudioPlayer implements MediaPlayer{
	public void play(){
		System.out.println("Audio player is playing");
	}
	public void pause(){
		System.out.println("Audio player is paused");
	}
	public void stop(){
		System.out.println("Audio player is stopped");
	}	
}

class VideoPlayer implements MediaPlayer{
	public void play(){
		System.out.println("Video player is playing");
	}
	public void pause(){
		System.out.println("Video player is paused");
	}
	public void stop(){
		System.out.println("Video player is stopped");
	}	
}

public class Program11{
	public static void main(String args[]){
	 MediaPlayer video=new VideoPlayer();
	 video.play();
	 video.pause();
	 video.stop();
	 MediaPlayer audio=new AudioPlayer();
	 video.play();
	 video.pause();
	 video.stop();
	 
	}
}