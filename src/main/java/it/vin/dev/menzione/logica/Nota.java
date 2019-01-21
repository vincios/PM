package it.vin.dev.menzione.logica;

import java.sql.Date;
import java.util.Objects;

public class Nota {
	
	private long id;
	private Date data;
	private String testo;
	private String tipo;
	public static final String NOTA = "nota";
	public static final String FERMI = "fermi";
	public static final String NONASS = "nonass";
	
	@Override
	public String toString() {
		return "Nota [id=" + id + ", data=" + data + ", testo=" + testo + ", tipo=" + tipo + "]";
	}

	public Nota(long id, Date data, String testo, String tipo) {
		super();
		this.id = id;
		this.data = data;
		this.testo = testo;
		this.tipo = tipo;
	}
	
	public Nota(Date data, String testo, String tipo) {
		super();
		this.data = data;
		this.testo = testo;
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota = (Nota) o;
        return id == nota.id &&
                Objects.equals(data, nota.data) &&
                Objects.equals(testo, nota.testo) &&
                Objects.equals(tipo, nota.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, testo, tipo);
    }
}
