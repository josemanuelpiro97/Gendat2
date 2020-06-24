package IU;

import BaseDeDatos.*;
import Observer.Observador;
import Observer.Sujeto;

/**
 *
 * @author FedeSSD
 */
public class VistaSeleccion extends javax.swing.JPanel implements Observador {
    //campo de vista principal
    VistaPrincipal vistaPrincipal;
    //sujeto a quien observar
    Sujeto usuario;
    //agenda que muestro
    Agenda agendaSeleccionada;
    //arreglo para modulo
    Object matrix[][];


    public VistaSeleccion(VistaPrincipal vp) {
        //arranco matrix
        this.matrix = new Object [][] {
                {"06:00", null, null, null, null, null, null, null},
                {"06:15", null, null, null, null, null, null, null},
                {"06:30", null, null, null, null, null, null, null},
                {"06:45", null, null, null, null, null, null, null},
                {"07:00", null, null, null, null, null, null, null},
                {"07:15", null, null, null, null, null, null, null},
                {"07:30", null, null, null, null, null, null, null},
                {"07:45", null, null, null, null, null, null, null},
                {"08:00", null, null, null, null, null, null, null},
                {"08:15", null, null, null, null, null, null, null},
                {"08:30", null, null, null, null, null, null, null},
                {"08:45", null, null, null, null, null, null, null},
                {"09:00", null, null, null, null, null, null, null},
                {"09:15", null, null, null, null, null, null, null},
                {"09:30", null, null, null, null, null, null, null},
                {"09:45", null, null, null, null, null, null, null},
                {"10:00", null, null, null, null, null, null, null},
                {"10:15", null, null, null, null, null, null, null},
                {"10:30", null, null, null, null, null, null, null},
                {"10:45", null, null, null, null, null, null, null},
                {"11:00", null, null, null, null, null, null, null},
                {"11:15", null, null, null, null, null, null, null},
                {"11:30", null, null, null, null, null, null, null},
                {"11:45", null, null, null, null, null, null, null},
                {"12:00", null, null, null, null, null, null, null},
                {"12:15", null, null, null, null, null, null, null},
                {"12:30", null, null, null, null, null, null, null},
                {"12:45", null, null, null, null, null, null, null},
                {"13:00", null, null, null, null, null, null, null},
                {"13:15", null, null, null, null, null, null, null},
                {"13:30", null, null, null, null, null, null, null},
                {"13:45", null, null, null, null, null, null, null},
                {"14:00", null, null, null, null, null, null, null},
                {"14:15", null, null, null, null, null, null, null},
                {"14:30", null, null, null, null, null, null, null},
                {"14:45", null, null, null, null, null, null, null},
                {"15:00", null, null, null, null, null, null, null},
                {"15:15", null, null, null, null, null, null, null},
                {"15:30", null, null, null, null, null, null, null},
                {"15:45", null, null, null, null, null, null, null},
                {"16:00", null, null, null, null, null, null, null},
                {"16:15", null, null, null, null, null, null, null},
                {"16:30", null, null, null, null, null, null, null},
                {"16:45", null, null, null, null, null, null, null},
                {"17:00", null, null, null, null, null, null, null},
                {"17:15", null, null, null, null, null, null, null},
                {"17:30", null, null, null, null, null, null, null},
                {"17:45", null, null, null, null, null, null, null},
                {"18:00", null, null, null, null, null, null, null},
                {"18:15", null, null, null, null, null, null, null},
                {"18:30", null, null, null, null, null, null, null},
                {"18:45", null, null, null, null, null, null, null},
                {"19:00", null, null, null, null, null, null, null},
                {"19:15", null, null, null, null, null, null, null},
                {"19:30", null, null, null, null, null, null, null},
                {"19:45", null, null, null, null, null, null, null},
                {"20:00", null, null, null, null, null, null, null},
                {"20:15", null, null, null, null, null, null, null},
                {"20:30", null, null, null, null, null, null, null},
                {"20:45", null, null, null, null, null, null, null},
                {"21:00", null, null, null, null, null, null, null},
                {"21:15", null, null, null, null, null, null, null},
                {"21:30", null, null, null, null, null, null, null},
                {"21:45", null, null, null, null, null, null, null},
                {"22:00", null, null, null, null, null, null, null},
                {"22:15", null, null, null, null, null, null, null},
                {"22:30", null, null, null, null, null, null, null},
                {"22:45", null, null, null, null, null, null, null},
                {"23:00", null, null, null, null, null, null, null},
                {"23:15", null, null, null, null, null, null, null},
                {"23:30", null, null, null, null, null, null, null},
                {"23:45", null, null, null, null, null, null, null},
                {"00:00", null, null, null, null, null, null, null}
        };

        //inicializo componentes
        initComponents();
        this.vistaPrincipal = vp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AgendaSemanal = new javax.swing.JTable();

        AgendaSemanal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AgendaSemanal.setModel(new javax.swing.table.DefaultTableModel(
                this.matrix,
            new String [] {
                "Hora/Dia", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AgendaSemanal.setColumnSelectionAllowed(true);
        AgendaSemanal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgendaSemanal.setRowMargin(2);
        AgendaSemanal.setShowGrid(true);
        jScrollPane1.setViewportView(AgendaSemanal);
        AgendaSemanal.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AgendaSemanal;
    private javax.swing.JScrollPane jScrollPane1;





    //-------------METODOS----------------------
    //******************************************
    /**
     * @brief setea el usuario actual en la vista
     * @param usuario usuario que observara la vista
     */
    public void setSujeto(Sujeto usuario){
        //asigno el sujeto y me registro
        this.usuario = usuario;
        this.usuario.registrarObservador(this);
    }

    /**
     * @brief metodo que actualiza la informacion de la vista
     */
    public void actualizarVista(){
        Usuario usuario = (Usuario) this.usuario;
        Agenda agendaParaPoner = usuario.getAgendaSeleccionada();

        //actualizo matrix
        //(la lista de materias)
        for (EventoInterfaz materiaActual: agendaParaPoner.getListaMaterias()){
            Materia materia = (Materia) materiaActual;
            Comision comision = (Comision) materia.getVariante(0);
            //relleno campos
            int tokens = this.getTokens(comision.getHoraInicio(),comision.getHoraFin(),comision.getMinInicio(),comision.getMinFin());
            int tokenIni = this.getTokenInicial(comision.getHoraInicio(),comision.getMinInicio());
            this.completarHorarios(tokens,tokenIni,comision.getDia(), materia.getNombre());
        }
        //(la lista de eventos particulares)
        for (EventoInterfaz eventoActual: agendaParaPoner.getListaEventos()){
            EventoParticular eventoParticular = (EventoParticular) eventoActual;
            OpcionEP opcionEP = (OpcionEP) eventoParticular.getVariante(0);
            //relleno campos
            int tokens = this.getTokens(opcionEP.getHoraInicio(),opcionEP.getHoraFin(),opcionEP.getMinInicio(),opcionEP.getMinFin());
            int tokenIni = this.getTokenInicial(opcionEP.getHoraInicio(),opcionEP.getMinInicio());
            this.completarHorarios(tokens,tokenIni,opcionEP.getDia(), eventoParticular.getNombre());
        }

        //actualizo agenda
        AgendaSemanal.setModel(new javax.swing.table.DefaultTableModel(
                this.matrix,
                new String [] {
                        "Hora/Dia", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
                }));
    }

    /**
     * @brief completa los casilleros correspondientes con el nombre de la materia/evento
     * @param tokens numero de casilleros a pintar
     * @param nombre nombre nombre de la materia/evento
     * @param dia dia del evento
     */
    public void completarHorarios(int tokens, int tokenIni, int dia, String nombre){
        //dado que la primer columna es para los horarios
        int columna = dia + 1;
        for (int i = tokenIni ; i< tokenIni+tokens ; i++){
            this.matrix[columna][i] = nombre;
        }
    }

    /**
     * @brief  dependiendo del horario, calcula la cantidad de bloques de 15 minutos que debere completar de la tabla
     * @param horaInicio hora inicio
     * @param horaFin hora fin
     * @param minInicio minuto inicio
     * @param minFinal minuto final
     * @return cantidad de tokens
     */
    public int getTokens(int horaInicio,int horaFin, int minInicio, int minFinal){
        int minInicial = (horaInicio * 60 + minInicio);
        int minFin = (horaFin *60 + minFinal);
        float dif = minFin - minFinal;

        //redondeo ya que al final del rango de horario se escribe un minuto menos
        int cantidadTokens = Math.round(dif/15);
        return cantidadTokens;
    }

    /**
     * @brief me calcula cual seria el token desde el cual iniciar a escribir
     * @param horaInicio hora de inicio
     * @param minInicio minuto de inicio
     * @return token del cual inciar
     */
    public int getTokenInicial(int horaInicio, int minInicio){
        int minuIni = (horaInicio * 60 + minInicio) - 360;
        int tokenIni = minuIni / 15;

        return tokenIni;
    }


    /**
     * desinscribe al observador
     */
    public void deinscribir() {
        this.usuario.removerObservador(this);
    }
    //-------------INTERFAZ----------------------
    //******************************************
    @Override
    public void actualizar() {
        Usuario usuarioCast = (Usuario)this.usuario;
        this.agendaSeleccionada = usuarioCast.getAgendaSeleccionada();
        this.actualizarVista();
    }

    @Override
    public int getID() {
        return 0;
    }


    // End of variables declaration//GEN-END:variables
}
