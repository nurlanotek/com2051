package finals.discountRate;

public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer(String name) {
        this.name = name;
        this.member = false;
        this.memberType = null;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        if (!member) {
            this.setMemberType(null);
        }
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        if (memberType != null) {
            memberType = memberType.toLowerCase();
        }

        if (memberType == null || memberType.isEmpty()) {
            this.member = false;
            this.memberType = null;
        } else if (memberType.equals("premium") || memberType.equals("gold") || memberType.equals("silver")) {
            this.setMember(true);
            this.memberType = memberType;
        } else {
            this.member = false;
            this.memberType = null;
        }
    }

    @Override
    public String toString() {
        return "Customer(" +
                "name=" + getName() +
                ", member=" + isMember() +
                ", memberType=" + getMemberType() +
                ')';
    }
}
