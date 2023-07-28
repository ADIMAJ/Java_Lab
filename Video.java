Bean Class File : Video.java

public class Video {
	String mName;
	boolean status;
	double rating;

	public Video(String mName, boolean status, double rating) {
		super();
		this.mName = mName;
		this.status = status;
		this.rating = rating;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getRating() {
		return rating;
	}

	public double setRating(double rating) {
		return this.rating = rating;
	}
}



Methods Class File : VideoMethods.java

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class VideoMethods {
	List<Video> MovieList = new ArrayList<Video>();

	public void AddMovies() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the name of the movie:");
		String mName = in.nextLine();
		System.out.print("Enter the status of the movie(True/False):");
		boolean status = in.nextBoolean();
		System.out.print("Enter the ratings for the movie(0-5):");
		double rating = in.nextDouble();
		Video v = new Video(mName, status, rating);
		MovieList.add(v);
		System.out.println("Library Initialized");
	}

	public void DisplayAll() {
		if (MovieList.isEmpty()) {
			System.out.println("No movies in the library");
		}
		for (Video m : MovieList) {
			System.out.println(
					"Movie : " + m.getmName() + " " + "Status :" + m.isStatus() + " " + "Rating " + m.getRating());
		}
	}

	boolean RentOut(String name) {
		for (Video m : MovieList) {
			if (m.getmName().equalsIgnoreCase(name)) {
				if (m.isStatus()) {
					m.setStatus(false);
					return true;
				}
			}
			return false;
		}
		return false;
	}

	public void CollectIn(String name, double rat) {
		boolean flag = false;
		for (Video m : MovieList) {
			if (m.getmName().equalsIgnoreCase(name)) {
				m.setStatus(true);
				flag = true;
				Math.round(m.setRating((m.getRating() + rat) / 2));
			}
		}
		if (!flag) {
			System.out.println("Requested Movie not rented out");
		}
	}
}




Main Class File: VideoMain.java

import java.util.Scanner;

public class VideoMain {
	public static void main(String args[]) {
		VideoMethods mm = new VideoMethods();
		while (true) {
			System.out.println("%%%%%%%% VIDEO LIBRARY CENTER %%%%%%%%");
			int n;
			Scanner in = new Scanner(System.in);
			System.out.println("1.ADD MOVIES");
			System.out.println("2.DISPLAY MOVIES");
			System.out.println("3.RENT OUT");
			System.out.println("4.COLLECT BACK ");
			System.out.println("PLEASE ENTER YOUR OPTION");
			n = in.nextInt();
			switch (n) {
			case 1:
				mm.AddMovies();
				break;
			case 2:
				mm.DisplayAll();
				break;
			case 3:
				System.out.print("Enter the movie you want to rent.");
				in.nextLine();
				if (mm.RentOut(in.nextLine())) {
					System.out.println("Rent out successfull");
				} else {
					System.out.println("Sorry!! Not Available");
				}
				break;
			case 4:
				System.out.println("Enter the name and the ratings of the movie");
				in.nextLine();
				mm.CollectIn(in.nextLine(), in.nextDouble());
				break;
			}
		}
	}
}
