
public class Application {
	public static void main(String[] args) {
		Manager manager1 = new Manager(1, "john");
		manager1.setMail("john@gmail");
		manager1.setPhoneNumber(923746523);
		
		Developer developer1 = new Developer(2, "chris");
		developer1.setMail("chris@gmail");
		developer1.setPhoneNumber(934657823);
		
		Tester tester1 = new Tester(3, "Sean");
		tester1.setMail("sean@gmail");
		tester1.setPhoneNumber(934527837);
		
		Project project1 = new Project(9, "Bug Tracking", manager1.getId(), developer1.getId(), tester1.getId());
		
		Bug bug1 = new Bug(17, project1.getProjectID());
		project1.bugs.add(bug1);
		System.out.println(project1.bugs);
		tester1.addNewBug(bug1, tester1.getId(), "invalid loop", PRIORITY.HIGH, TYPE.OUT_OF_BOUND, STATUS.OPEN, "iterate method", "v1.2", SEVERITY.HIGH);
		manager1.assignBug(bug1, developer1.getId());
		developer1.setBugStatus(bug1, STATUS.FIXED);
		developer1.assignBugTester(bug1, tester1.getId());
		manager1.displayBugDetails(bug1);
		tester1.setBugStatus(bug1, STATUS.RETEST);
		System.out.println(bug1);
		tester1.setBugStatus(bug1, STATUS.VERIFIED);
		tester1.setBugStatus(bug1, STATUS.CLOSED);
		manager1.displayBugDetails(bug1);
	}
}
