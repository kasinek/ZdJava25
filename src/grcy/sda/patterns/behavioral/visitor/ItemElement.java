package grcy.sda.patterns.behavioral.visitor;

public interface ItemElement {

	public int accept(ItemVisitor visitor);
}
