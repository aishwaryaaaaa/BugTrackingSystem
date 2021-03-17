
public class Developer extends Employee{

	public Developer(int id, String name) {
		setId(id);
		setName(name);
	}
	
	public void setBugStatus(Bug bug, STATUS status) {
		bug.setStatus(status);
	}
	public void assignBugTester(Bug bug, int testerID) {
		bug.setTesterID(testerID);
		bug.setStatus(STATUS.PENDING_RETEST);
	}
	@Override
	public String toString() {
		return "Id is: "+this.getId()+" and name is: "+this.getName();
		
	}
}
