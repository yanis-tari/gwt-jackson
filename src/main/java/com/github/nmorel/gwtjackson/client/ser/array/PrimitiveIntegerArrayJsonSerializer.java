package com.github.nmorel.gwtjackson.client.ser.array;

import javax.annotation.Nonnull;
import java.io.IOException;

import com.github.nmorel.gwtjackson.client.JsonSerializationContext;
import com.github.nmorel.gwtjackson.client.JsonSerializer;
import com.github.nmorel.gwtjackson.client.stream.JsonWriter;

/**
 * Default {@link JsonSerializer} implementation for array of int.
 *
 * @author Nicolas Morel
 */
public class PrimitiveIntegerArrayJsonSerializer extends JsonSerializer<int[]> {

    private static final PrimitiveIntegerArrayJsonSerializer INSTANCE = new PrimitiveIntegerArrayJsonSerializer();

    /**
     * @return an instance of {@link PrimitiveIntegerArrayJsonSerializer}
     */
    public static PrimitiveIntegerArrayJsonSerializer getInstance() {
        return INSTANCE;
    }

    private PrimitiveIntegerArrayJsonSerializer() { }

    @Override
    public void doSerialize( JsonWriter writer, @Nonnull int[] values, JsonSerializationContext ctx ) throws IOException {
        if ( !ctx.isWriteEmptyJsonArrays() && values.length == 0 ) {
            writer.cancelName();
            return;
        }

        if ( ctx.isWriteSingleElemArraysUnwrapped() && values.length == 1 ) {
            writer.value( values[0] );
        } else {
            writer.beginArray();
            for ( int value : values ) {
                writer.value( value );
            }
            writer.endArray();
        }
    }
}
