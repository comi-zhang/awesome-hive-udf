package com.kuaishou.udf.examples;

import java.util.List;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

@Description(name = "example_arraysum", value = "_FUNC_(expr) - Example UDAF that returns the sum")
public class UDFExampleArraySum extends UDF {
    public Double evaluate(List<Double> a) {
        if (a == null) {
            return null;
        }
        double total = 0;
        for (int i = 0; i < a.size(); i++) {
            Double e = a.get(i);
            if (e != null) {
                total += e;
            }
        }
        return total;
    }
}
