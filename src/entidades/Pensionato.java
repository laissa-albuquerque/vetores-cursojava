package entidades;

public class Pensionato {

	private Aluguel[] room = new Aluguel[10];

	public void registraAluguel(Aluguel aluguel) {
		if (room[aluguel.getNumQuarto()] == null) {
			room[aluguel.getNumQuarto()] = aluguel;
		} else {
			System.out.println("Quarto já ocupado!");
		}

	}

	public Aluguel[] getRoom() {
		return room;
	}

	public void setRoom(Aluguel[] room) {
		this.room = room;
	}

}
