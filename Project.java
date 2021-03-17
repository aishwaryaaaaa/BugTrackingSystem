import java.util.ArrayList;
import java.util.List;

public class Project {
	List<Bug> bugs ;
	private int projectID;
	private int developerID;
	private int testerID;
	private int managerID;
	private String projectName;
	
	public Project(int projectId, String projectName , int managerId, int developerId, int testerId) {
		setProjectID(projectId);
		setDeveloperID(developerId);
		setTesterID(testerId);
		setManagerID(managerId);
		setProjectName(projectName);
		bugs = new ArrayList<Bug>();
	}

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public int getDeveloperID() {
		return developerID;
	}

	public void setDeveloperID(int developerID) { 
		this.developerID = developerID;
	}

	public int getTesterID() {
		return testerID;
	}

	public void setTesterID(int testerID) {
		this.testerID = testerID;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
}
