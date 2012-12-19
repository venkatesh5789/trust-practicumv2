/**
 * 
 */
package element;

/**
 * @author NASA-Trust-Team
 * 
 */
public final class Edge {
	private double coAuthorWeight = 1.00;
	private double followWeight = 1.00;
	private int id;
	private static int count;
	private Node startNode;
	private Node endNode;
	private double edgeWeight;

	public Edge() {
		id = ++count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCoAuthorWeight() {
		return coAuthorWeight;
	}

	public void setCoAuthorWeight(double coAuthorWeight) {
		this.coAuthorWeight = coAuthorWeight;
	}

	public double getFollowWeight() {
		return followWeight;
	}

	public void setFollowWeight(double followWeight) {
		this.followWeight = followWeight;
	}

	public Node getStartNode() {
		return startNode;
	}

	public void setStartNode(Node startNode) {
		this.startNode = startNode;
	}

	public void setEndNode(Node endNode) {
		this.endNode = endNode;
	}

	public double getEdgeWeight() {
		return edgeWeight;
	}

	public void setEdgeWeight(int val, char sourceFlag) {
		if (sourceFlag == 'A') {
			this.edgeWeight = val * coAuthorWeight;
		} else if (sourceFlag == 'B') {
			this.edgeWeight = val * followWeight;
		}
	}

	public Node getEndNode() {
		return endNode;
	}

	public String toString() {
		return "E " + this.id;
	}

}