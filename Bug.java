
public class Bug {
//TODO: Add submittedOn property
	private int bugID;
	private int projectID;
	private int developerID;
	private int testerID;
	private String name;
	private PRIORITY priority;
	private TYPE type;
	private STATUS status;
	private String location;
	private String buildVersion;
	private SEVERITY severity;
	
	public Bug(int bugID, int ProjectID) {
		setBugID(bugID);
		setProjectID(ProjectID);
	}
	public int getBugID() {
		return bugID;
	}
	public void setBugID(int bugID) {
		this.bugID = bugID;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PRIORITY getPriority() {
		return priority;
	}
	public void setPriority(PRIORITY priority) {
		this.priority = priority;
	}
	public TYPE getType() {
		return type;
	}
	public void setType(TYPE type) {
		this.type = type;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBuildVersion() {
		return buildVersion;
	}
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}
	public SEVERITY getSeverity() {
		return severity;
	}
	public void setSeverity(SEVERITY severity) {
		this.severity = severity;
	}
	
	@Override
	public String toString() {
		return "[Bug id= "+this.getBugID()+" Bug name= "+this.getName()+" Priority= "+this.getPriority()+" Type= "+this.getType()+" and Status= "+this.getStatus()+"]";
		
	}
	
}
