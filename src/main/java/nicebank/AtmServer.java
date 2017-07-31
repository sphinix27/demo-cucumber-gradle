package nicebank;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by Abel on 30/07/2017.
 */
public class AtmServer {
    private final Server server;

    public AtmServer(int port, CashSlot cashSlot, Account account) {
        server = new Server(port);

        ServletContextHandler context =
                new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        context.addServlet(new ServletHolder(
                new WithdrawalServlet(cashSlot, account)), "/withdraw");
        context.addServlet(new ServletHolder(new AtmServlet()), "/");
    }

    public void start() throws Exception {
        server.start();
    }

    public void stop() throws Exception {
        server.stop();
    }

    public static void main(String[] args) throws Exception {
        new AtmServer(9988, new CashSlot(), new Account()).start();
    }
}
