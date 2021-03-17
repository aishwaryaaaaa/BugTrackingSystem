
public class Tester extends Employee{

	public Tester(int id, String name) {
		setId(id);
		setName(name);
	}

	public void addNewBug(Bug bug, int testerID, String name, PRIORITY priority, TYPE type, STATUS status, String location, String buildVersion, SEVERITY severity) {
		bug.setTesterID(testerID);
		bug.setName(name);
		bug.setPriority(priority);
		bug.setType(type);
		bug.setStatus(status);
		bug.setLocation(location);
		bug.setBuildVersion(buildVersion);
		bug.setSeverity(severity);
	}
	
	public void setBugStatus(Bug bug, STATUS status) {
		bug.setStatus(status);
	}
	@Override
	public String toString() {
		return "Id is: "+this.getId()+" and name is: "+this.getName();
		
	}
}
