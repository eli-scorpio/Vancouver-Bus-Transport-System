import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class  Input {
        BufferedReader br;
        StringTokenizer st;

        public Input(String file) throws FileNotFoundException {
            br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file)));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        void close() throws IOException {
            br.close();
        }
    }