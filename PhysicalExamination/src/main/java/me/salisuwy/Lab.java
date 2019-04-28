package me.salisuwy;

import javax.persistence.*;

@Entity @Table(name="qpd_labresult")
public class Lab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="LabID")
    private int labId;
	@Column(name="TransactionID")
    private int transactionId;
    @Column(name="PatientID")
    private int patientId;
	@Column(name="WhiteBlood")
    private String whiteBlood;
    @Column(name="Hemoglobin")
    private String hemoglobin;
    @Column(name="HemoNR")
    private String hemoNr;
    @Column(name="Neutrophils")
    private String neutrophils;
    @Column(name="Lymphocytes")
    private String lymphocytes;
    @Column(name="Monocytes")
    private String monocytes;
    @Column(name="CBCOt")
    private String cbcot;
    @Column(name="EOS")
    private String eos;
    @Column(name="BAS")
    private String bas;
    @Column(name="CBCRBC")
    private String cbcrbc;
    @Column(name="PLT")
    private String plt;
    @Column(name="FBS")
    private String fbs;
    @Column(name="FBScon")
    private String fbscon;
    @Column(name="BUA")
    private String bua;
    @Column(name="BUAcon")
    private String bu;
    @Column(name="BUN")
    private String bun;
    @Column(name="BUNcon")
    private String buncon;
    @Column(name="CREA")
    private String crea;
    @Column(name="CREAcon")
    private String creacon;
    @Column(name="CHOL")
    private String chol;
    @Column(name="CHOLcon")
    private String cholcon;
    @Column(name="TRIG")
    private String trig;
    @Column(name="TRIGcon")
    private String trigcon;
    @Column(name="HDL")
    private String hdl;
    @Column(name="HDLcon")
    private String hdlcon;
    @Column(name="LDLcon")
    private String ldlcon;
    @Column(name="CH")
    private String ch;
    @Column(name="VLDL")
    private String vldl;
    @Column(name="Na")
    private String na;
    @Column(name="K")
    private String k;
    @Column(name="Cl")
    private String cl;
    @Column(name="ALT")
    private String alt;
    @Column(name="AST")
    private String ast;
    @Column(name="HB")
    private String hb;
    @Column(name="Meth")
    private String meth;
    @Column(name="Tetra")
    private String tetra;
    @Column(name="DT")
    private String dt;
    @Column(name="HBsAg")
    private String hbsag;
    @Column(name="PregTest")
    private String pregTest;
    @Column(name="SeroOt")
    private String seroOt;
    @Column(name="FecColor")
    private String fecColor;
    @Column(name="FecCon")
    private String fecCon;
    @Column(name="FecMicro")
    private String fecMicro;
    @Column(name="FecOt")
    private String fecOt;
    @Column(name="UriColor")
    private String uriColor;
    @Column(name="UriTrans")
    private String uriTrans;
    @Column(name="UriPh")
    private String uriPh;
    @Column(name="UriSp")
    private String uriSp;
    @Column(name="UriPro")
    private String uriPro;
    @Column(name="UriGlu")
    private String uriGlu;
    @Column(name="RBC")
    private String rbc;
    @Column(name="WBC")
    private String wbc;
    @Column(name="BAC")
    private String bac;
    @Column(name="MThreads")
    private String mThreads;
    @Column(name="ECells")
    private String eCells;
    @Column(name="Amorph")
    private String amorph;
    @Column(name="CoAx")
    private String coAx;
    @Column(name="UriOT")
    private String uriOt;
    @Column(name="LE")
    private String le;
    @Column(name="NIT")
    private String nit;
    @Column(name="URO")
    private String uro;
    @Column(name="BLD")
    private String bld;
    @Column(name="Received")
    private String received;
    @Column(name="Printed")
    private String printed;
    @Column(name="QC")
    private String qc;
    @Column(name="Clinician")
    private String clinician;
    @Column(name="QCLIC")
    private String qclic;
    @Column(name="RMTLIC")
    private String rmtlic;
    @Column(name="PATHLIC")
    private String pathlic;
    @Column(name="CreationDate")
    private String creationDate;
    @Column(name="DateUpdate")
    private String dateUpdate;
   

	public int getLabId() {
		return labId;
	}
	public void setLabId(int labId) {
		this.labId = labId;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public double getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getWhiteBlood() {
		return whiteBlood;
	}
	public void setWhiteBlood(String whiteBlood) {
		this.whiteBlood = whiteBlood;
	}
	public String getHemoglobin() {
		return hemoglobin;
	}
	public void setHemoglobin(String hemoglobin) {
		this.hemoglobin = hemoglobin;
	}
	public String getHemoNr() {
		return hemoNr;
	}
	public void setHemoNr(String hemoNr) {
		this.hemoNr = hemoNr;
	}
	public String getNeutrophils() {
		return neutrophils;
	}
	public void setNeutrophils(String neutrophils) {
		this.neutrophils = neutrophils;
	}
	public String getLymphocytes() {
		return lymphocytes;
	}
	public void setLymphocytes(String lymphocytes) {
		this.lymphocytes = lymphocytes;
	}
	public String getMonocytes() {
		return monocytes;
	}
	public void setMonocytes(String monocytes) {
		this.monocytes = monocytes;
	}
	public String getCbcot() {
		return cbcot;
	}
	public void setCbcot(String cbcot) {
		this.cbcot = cbcot;
	}
	public String getEos() {
		return eos;
	}
	public void setEos(String eos) {
		this.eos = eos;
	}
	public String getBas() {
		return bas;
	}
	public void setBas(String bas) {
		this.bas = bas;
	}
	public String getCbcrbc() {
		return cbcrbc;
	}
	public void setCbcrbc(String cbcrbc) {
		this.cbcrbc = cbcrbc;
	}
	public String getPlt() {
		return plt;
	}
	public void setPlt(String plt) {
		this.plt = plt;
	}
	public String getFbs() {
		return fbs;
	}
	public void setFbs(String fbs) {
		this.fbs = fbs;
	}
	public String getFbscon() {
		return fbscon;
	}
	public void setFbscon(String fbscon) {
		this.fbscon = fbscon;
	}
	public String getBua() {
		return bua;
	}
	public void setBua(String bua) {
		this.bua = bua;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public String getBun() {
		return bun;
	}
	public void setBun(String bun) {
		this.bun = bun;
	}
	public String getBuncon() {
		return buncon;
	}
	public void setBuncon(String buncon) {
		this.buncon = buncon;
	}
	public String getCrea() {
		return crea;
	}
	public void setCrea(String crea) {
		this.crea = crea;
	}
	public String getCreacon() {
		return creacon;
	}
	public void setCreacon(String creacon) {
		this.creacon = creacon;
	}
	public String getChol() {
		return chol;
	}
	public void setChol(String chol) {
		this.chol = chol;
	}
	public String getCholcon() {
		return cholcon;
	}
	public void setCholcon(String cholcon) {
		this.cholcon = cholcon;
	}
	public String getTrig() {
		return trig;
	}
	public void setTrig(String trig) {
		this.trig = trig;
	}
	public String getTrigcon() {
		return trigcon;
	}
	public void setTrigcon(String trigcon) {
		this.trigcon = trigcon;
	}
	public String getHdl() {
		return hdl;
	}
	public void setHdl(String hdl) {
		this.hdl = hdl;
	}
	public String getHdlcon() {
		return hdlcon;
	}
	public void setHdlcon(String hdlcon) {
		this.hdlcon = hdlcon;
	}
	public String getLdlcon() {
		return ldlcon;
	}
	public void setLdlcon(String ldlcon) {
		this.ldlcon = ldlcon;
	}
	public String getCh() {
		return ch;
	}
	public void setCh(String ch) {
		this.ch = ch;
	}
	public String getVldl() {
		return vldl;
	}
	public void setVldl(String vldl) {
		this.vldl = vldl;
	}
	public String getNa() {
		return na;
	}
	public void setNa(String na) {
		this.na = na;
	}
	public String getK() {
		return k;
	}
	public void setK(String k) {
		this.k = k;
	}
	public String getCl() {
		return cl;
	}
	public void setCl(String cl) {
		this.cl = cl;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getAst() {
		return ast;
	}
	public void setAst(String ast) {
		this.ast = ast;
	}
	public String getHb() {
		return hb;
	}
	public void setHb(String hb) {
		this.hb = hb;
	}
	public String getMeth() {
		return meth;
	}
	public void setMeth(String meth) {
		this.meth = meth;
	}
	public String getTetra() {
		return tetra;
	}
	public void setTetra(String tetra) {
		this.tetra = tetra;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getHbsag() {
		return hbsag;
	}
	public void setHbsag(String hbsag) {
		this.hbsag = hbsag;
	}
	public String getPregTest() {
		return pregTest;
	}
	public void setPregTest(String pregTest) {
		this.pregTest = pregTest;
	}
	public String getSeroOt() {
		return seroOt;
	}
	public void setSeroOt(String seroOt) {
		this.seroOt = seroOt;
	}
	public String getFecColor() {
		return fecColor;
	}
	public void setFecColor(String fecColor) {
		this.fecColor = fecColor;
	}
	public String getFecCon() {
		return fecCon;
	}
	public void setFecCon(String fecCon) {
		this.fecCon = fecCon;
	}
	public String getFecMicro() {
		return fecMicro;
	}
	public void setFecMicro(String fecMicro) {
		this.fecMicro = fecMicro;
	}
	public String getFecOt() {
		return fecOt;
	}
	public void setFecOt(String fecOt) {
		this.fecOt = fecOt;
	}
	public String getUriColor() {
		return uriColor;
	}
	public void setUriColor(String uriColor) {
		this.uriColor = uriColor;
	}
	public String getUriTrans() {
		return uriTrans;
	}
	public void setUriTrans(String uriTrans) {
		this.uriTrans = uriTrans;
	}
	public String getUriPh() {
		return uriPh;
	}
	public void setUriPh(String uriPh) {
		this.uriPh = uriPh;
	}
	public String getUriSp() {
		return uriSp;
	}
	public void setUriSp(String uriSp) {
		this.uriSp = uriSp;
	}
	public String getUriPro() {
		return uriPro;
	}
	public void setUriPro(String uriPro) {
		this.uriPro = uriPro;
	}
	public String getUriGlu() {
		return uriGlu;
	}
	public void setUriGlu(String uriGlu) {
		this.uriGlu = uriGlu;
	}
	public String getRbc() {
		return rbc;
	}
	public void setRbc(String rbc) {
		this.rbc = rbc;
	}
	public String getWbc() {
		return wbc;
	}
	public void setWbc(String wbc) {
		this.wbc = wbc;
	}
	public String getBac() {
		return bac;
	}
	public void setBac(String bac) {
		this.bac = bac;
	}
	public String getmThreads() {
		return mThreads;
	}
	public void setmThreads(String mThreads) {
		this.mThreads = mThreads;
	}
	public String geteCells() {
		return eCells;
	}
	public void seteCells(String eCells) {
		this.eCells = eCells;
	}
	public String getAmorph() {
		return amorph;
	}
	public void setAmorph(String amorph) {
		this.amorph = amorph;
	}
	public String getCoAx() {
		return coAx;
	}
	public void setCoAx(String coAx) {
		this.coAx = coAx;
	}
	public String getUriOt() {
		return uriOt;
	}
	public void setUriOt(String uriOt) {
		this.uriOt = uriOt;
	}
	public String getLe() {
		return le;
	}
	public void setLe(String le) {
		this.le = le;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getUro() {
		return uro;
	}
	public void setUro(String uro) {
		this.uro = uro;
	}
	public String getBld() {
		return bld;
	}
	public void setBld(String bld) {
		this.bld = bld;
	}
	public String getReceived() {
		return received;
	}
	public void setReceived(String received) {
		this.received = received;
	}
	public String getPrinted() {
		return printed;
	}
	public void setPrinted(String printed) {
		this.printed = printed;
	}
	public String getQc() {
		return qc;
	}
	public void setQc(String qc) {
		this.qc = qc;
	}
	public String getClinician() {
		return clinician;
	}
	public void setClinician(String clinician) {
		this.clinician = clinician;
	}
	public String getQclic() {
		return qclic;
	}
	public void setQclic(String qclic) {
		this.qclic = qclic;
	}
	public String getRmtlic() {
		return rmtlic;
	}
	public void setRmtlic(String rmtlic) {
		this.rmtlic = rmtlic;
	}
	public String getPathlic() {
		return pathlic;
	}
	public void setPathlic(String pathlic) {
		this.pathlic = pathlic;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
}
