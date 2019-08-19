
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package rapid.ext.astrobee;

import com.rti.dds.cdr.CdrEncapsulation;
import com.rti.dds.cdr.CdrInputStream;
import com.rti.dds.cdr.CdrOutputStream;
import com.rti.dds.cdr.CdrPrimitiveType;
import com.rti.dds.cdr.CdrBuffer;
import com.rti.dds.cdr.CdrHelper;
import com.rti.dds.cdr.CdrMemberInfo;
import com.rti.dds.domain.DomainParticipant;
import com.rti.dds.publication.DataWriter;
import com.rti.dds.publication.DataWriterListener;
import com.rti.dds.subscription.DataReader;
import com.rti.dds.subscription.DataReaderListener;
import com.rti.dds.topic.KeyHash_t;
import com.rti.dds.topic.TypeSupportImpl;
import com.rti.dds.topic.TypeSupportType;
import com.rti.dds.util.Sequence;
import com.rti.dds.topic.DefaultEndpointData;
import com.rti.dds.infrastructure.RETCODE_ERROR;

import com.rti.dds.infrastructure.*;
import com.rti.dds.topic.TypeSupportParticipantInfo;
import com.rti.dds.topic.TypeSupportEndpointInfo;
import com.rti.dds.typecode.TypeCode;
import com.rti.dds.cdr.IllegalCdrStateException;

import com.rti.dds.infrastructure.Copyable;

/**
* A collection of useful methods for dealing with objects of type
* DataToDiskState
*/

public class DataToDiskStateTypeSupport extends TypeSupportImpl {
    // -----------------------------------------------------------------------
    // Private Fields
    // -----------------------------------------------------------------------

    private static final String TYPE_NAME = "rapid::ext::astrobee::DataToDiskState";

    private static final char[] PLUGIN_VERSION = {2, 0, 0, 0};     
    private static final DataToDiskStateTypeSupport _singleton
    = new DataToDiskStateTypeSupport();

    // -----------------------------------------------------------------------
    // Public Methods
    // -----------------------------------------------------------------------

    // --- External methods: -------------------------------------------------
    /* The methods in this section are for use by users of RTI Connext
    */

    public static String get_type_name() {
        return _singleton.get_type_nameI();
    }

    public static void register_type(DomainParticipant participant,
    String type_name) {
        _singleton.register_typeI(participant, type_name);
    }

    public static void unregister_type(DomainParticipant participant,
    String type_name) {
        _singleton.unregister_typeI(participant, type_name);
    }

    /* The methods in this section are for use by RTI Connext
    * itself and by the code generated by rtiddsgen for other types.
    * They should be used directly or modified only by advanced users and are
    * subject to change in future versions of RTI Connext.
    */
    public static DataToDiskStateTypeSupport get_instance() {
        return _singleton;
    }

    public static DataToDiskStateTypeSupport getInstance() {
        return get_instance();
    }

    public static TypeCode getTypeCode(){
        return DataToDiskStateTypeCode.VALUE;
    }

    public Object create_data() {
        return DataToDiskState.create();
    }

    public void destroy_data(Object data) {
        return;
    }
    public Object create_key() {
        return new DataToDiskState();
    }

    public void destroy_key(Object key) {
        return;
    }
    public Class get_type() {
        return DataToDiskState.class;
    }

    /**
    * This is a concrete implementation of this method inherited from the base class.
    * This method will perform a deep copy of <code>source</code> into
    * <code>destination</code>.
    * 
    * @param src The Object which contains the data to be copied.
    * @return Returns <code>destination</code>.
    * @exception NullPointerException If <code>destination</code> or 
    * <code>source</code> is null.
    * @exception ClassCastException If either <code>destination</code> or
    * <code>this</code> is not a <code>DataToDiskState</code>
    * type.
    */
    public Object copy_data(Object destination, Object source) {

        DataToDiskState typedDst = (DataToDiskState) destination;
        DataToDiskState typedSrc = (DataToDiskState) source;

        return typedDst.copy_from(typedSrc);

    }

    public long get_serialized_sample_max_size(Object endpoint_data,boolean include_encapsulation,short encapsulation_id,long currentAlignment) {
        long origAlignment = currentAlignment;
        long encapsulation_size = currentAlignment;

        if(include_encapsulation) {
            if (!CdrEncapsulation.isValidEncapsulationKind(encapsulation_id)) {
                throw new RETCODE_ERROR("Unsupported encapsulation");
            }

            encapsulation_size += CdrPrimitiveType.SHORT.getMaxSizeSerialized(encapsulation_size);
            encapsulation_size += CdrPrimitiveType.SHORT.getMaxSizeSerialized(encapsulation_size);
            encapsulation_size -= currentAlignment;
            currentAlignment = 0;
            origAlignment = 0;

        } 

        currentAlignment += rapid.MessageTypeSupport.get_instance().get_serialized_sample_max_size(endpoint_data,false,encapsulation_id,currentAlignment);

        currentAlignment += CdrPrimitiveType.getStringMaxSizeSerialized(currentAlignment, (32)+1);
        currentAlignment += CdrPrimitiveType.BOOLEAN.getMaxSizeSerialized(currentAlignment );
        currentAlignment += rapid.ext.astrobee.SaveSettingSequence64TypeSupport.get_instance().get_serialized_sample_max_size(endpoint_data,false, encapsulation_id,currentAlignment);
        if (include_encapsulation) {
            currentAlignment += encapsulation_size;
        }
        return  currentAlignment - origAlignment;
    }

    public long get_serialized_sample_min_size(Object endpoint_data,boolean include_encapsulation,short encapsulation_id,long currentAlignment) {

        long origAlignment = currentAlignment;
        long encapsulation_size = currentAlignment;

        if(include_encapsulation) {
            if (!CdrEncapsulation.isValidEncapsulationKind(encapsulation_id)) {
                throw new RETCODE_ERROR("Unsupported encapsulation");
            }

            encapsulation_size += CdrPrimitiveType.SHORT.getMaxSizeSerialized(encapsulation_size);
            encapsulation_size += CdrPrimitiveType.SHORT.getMaxSizeSerialized(encapsulation_size);
            encapsulation_size -= currentAlignment;
            currentAlignment = 0;
            origAlignment = 0;

        } 

        currentAlignment += rapid.MessageTypeSupport.get_instance().get_serialized_sample_min_size(endpoint_data,false,encapsulation_id,currentAlignment);
        currentAlignment += CdrPrimitiveType.getStringMaxSizeSerialized(currentAlignment, 1);
        currentAlignment += CdrPrimitiveType.BOOLEAN.getMaxSizeSerialized(currentAlignment );
        currentAlignment += rapid.ext.astrobee.SaveSettingSequence64TypeSupport.get_instance().get_serialized_sample_min_size(endpoint_data,false, encapsulation_id,currentAlignment);

        if (include_encapsulation) {
            currentAlignment += encapsulation_size;
        }
        return  currentAlignment - origAlignment;

    }

    public long get_serialized_sample_size(
        Object endpoint_data, boolean include_encapsulation, 
        short encapsulation_id, long currentAlignment,
        Object sample) 
    {
        DataToDiskState typedSrc = (DataToDiskState) sample;
        long origAlignment = currentAlignment;
        long encapsulation_size = currentAlignment;

        if(include_encapsulation) {
            if (!CdrEncapsulation.isValidEncapsulationKind(encapsulation_id)) {
                throw new RETCODE_ERROR("Unsupported encapsulation");
            }

            encapsulation_size += CdrPrimitiveType.SHORT.getMaxSizeSerialized(encapsulation_size);
            encapsulation_size += CdrPrimitiveType.SHORT.getMaxSizeSerialized(encapsulation_size);
            encapsulation_size -= currentAlignment;
            currentAlignment = 0;
            origAlignment = 0;

        } 

        currentAlignment += rapid.MessageTypeSupport.get_instance().get_serialized_sample_size(
            endpoint_data,false,encapsulation_id,currentAlignment,sample);

        currentAlignment  +=  CdrPrimitiveType.getStringSerializedSize(currentAlignment , typedSrc.name );
        currentAlignment  +=  CdrPrimitiveType.BOOLEAN.getMaxSizeSerialized(currentAlignment);
        currentAlignment += rapid.ext.astrobee.SaveSettingSequence64TypeSupport.get_instance().get_serialized_sample_size(
            endpoint_data,false,encapsulation_id,currentAlignment,typedSrc.topicSaveSettings);

        if (include_encapsulation) {
            currentAlignment += encapsulation_size;
        }
        return currentAlignment - origAlignment;
    }

    public long get_serialized_key_max_size(
        Object endpoint_data,
        boolean include_encapsulation, 
        short encapsulation_id,
        long currentAlignment) 
    {
        long origAlignment = currentAlignment;
        long encapsulation_size = currentAlignment;

        if(include_encapsulation) {
            if (!CdrEncapsulation.isValidEncapsulationKind(encapsulation_id)) {
                throw new RETCODE_ERROR("Unsupported encapsulation");
            }

            encapsulation_size += CdrPrimitiveType.SHORT.getMaxSizeSerialized(encapsulation_size);
            encapsulation_size += CdrPrimitiveType.SHORT.getMaxSizeSerialized(encapsulation_size);
            encapsulation_size -= currentAlignment;
            currentAlignment = 0;
            origAlignment = 0;

        } 

        currentAlignment += rapid.MessageTypeSupport.get_instance().get_serialized_key_max_size(
            endpoint_data,
            false,encapsulation_id,currentAlignment);
        if (include_encapsulation) {
            currentAlignment += encapsulation_size;
        }

        return currentAlignment - origAlignment;
    }

    public void serialize(Object endpoint_data,Object src, CdrOutputStream dst,boolean serialize_encapsulation,
    short encapsulation_id, boolean serialize_sample, Object endpoint_plugin_qos) {
        int position = 0;

        if(serialize_encapsulation) {
            dst.serializeAndSetCdrEncapsulation(encapsulation_id);

            position = dst.resetAlignment();

        }

        if(serialize_sample) {

            DataToDiskState typedSrc = (DataToDiskState) src;

            rapid.MessageTypeSupport.get_instance().serialize(endpoint_data,src,dst,false,encapsulation_id,serialize_sample,endpoint_plugin_qos);

            dst.writeString(typedSrc.name,32);

            dst.writeBoolean(typedSrc.recording);

            rapid.ext.astrobee.SaveSettingSequence64TypeSupport.get_instance().serialize(endpoint_data, typedSrc.topicSaveSettings, dst, false, encapsulation_id,true,endpoint_plugin_qos);
        }

        if (serialize_encapsulation) {
            dst.restoreAlignment(position);
        }

    }
    public long serialize_to_cdr_buffer(
        byte[] buffer,
        long length,
        DataToDiskState src)
    {
        return super.serialize_to_cdr_buffer(buffer,length,src);
    }

    public void serialize_key(
        Object endpoint_data,
        Object src,
        CdrOutputStream dst,
        boolean serialize_encapsulation,
        short encapsulation_id,
        boolean serialize_key,
        Object endpoint_plugin_qos) 
    {
        int position = 0;

        if (serialize_encapsulation) {
            dst.serializeAndSetCdrEncapsulation(encapsulation_id);

            position = dst.resetAlignment();
        }

        if (serialize_key) {

            DataToDiskState typedSrc = (DataToDiskState) src;    
            rapid.MessageTypeSupport.get_instance().serialize_key(
                endpoint_data, src, dst, false, encapsulation_id, true, endpoint_plugin_qos);

        }

        if (serialize_encapsulation) {
            dst.restoreAlignment(position);
        }
    }

    public Object deserialize_sample(
        Object endpoint_data,
        Object dst, 
        CdrInputStream src, boolean deserialize_encapsulation,
        boolean deserialize_sample,
        Object endpoint_plugin_qos) 
    {
        int position = 0;

        if(deserialize_encapsulation) {
            src.deserializeAndSetCdrEncapsulation();

            position = src.resetAlignment();
        }

        if(deserialize_sample) {

            DataToDiskState typedDst = (DataToDiskState) dst;
            typedDst.clear();      
            rapid.MessageTypeSupport.get_instance().deserialize_sample(endpoint_data,dst,src,false,deserialize_sample,endpoint_plugin_qos);

            try{
                typedDst.name = src.readString(32);
                typedDst.recording = src.readBoolean();
                typedDst.topicSaveSettings = (rapid.ext.astrobee.SaveSettingSequence64)rapid.ext.astrobee.SaveSettingSequence64TypeSupport.get_instance().deserialize_sample(endpoint_data, typedDst.topicSaveSettings, src, false, true, endpoint_plugin_qos);     
            } catch (IllegalCdrStateException stateEx) {
                if (src.available() >= CdrEncapsulation.CDR_ENCAPSULATION_PARAMETER_ID_ALIGNMENT) {
                    throw new RETCODE_ERROR("Error deserializing sample! Remainder: " + src.available() + "\n" +
                    "Exception caused by: " + stateEx.getMessage());
                }
            } catch (Exception ex) {
                throw new RETCODE_ERROR(ex.getMessage());        
            }

        }
        if (deserialize_encapsulation) {
            src.restoreAlignment(position);
        }

        return dst;
    }

    public void deserialize_from_cdr_buffer(
        DataToDiskState dst,
        byte[] buffer,
        long length) 
    {
        super.deserialize_from_cdr_buffer(dst,buffer,length);
    }

    public Object deserialize_key_sample(
        Object endpoint_data,
        Object dst,
        CdrInputStream src,
        boolean deserialize_encapsulation,
        boolean deserialize_key,
        Object endpoint_plugin_qos) 
    {
        int position = 0;

        if(deserialize_encapsulation) {
            src.deserializeAndSetCdrEncapsulation();

            position = src.resetAlignment();
        }

        if(deserialize_key) {

            DataToDiskState typedDst = (DataToDiskState) dst;

            rapid.MessageTypeSupport.get_instance().deserialize_key_sample(
                endpoint_data, dst, src, false, true, endpoint_plugin_qos);

        }
        if (deserialize_encapsulation) {
            src.restoreAlignment(position);
        }

        return dst;
    }

    public void skip(Object endpoint_data, 
    CdrInputStream src,
    boolean skip_encapsulation, 
    boolean skip_sample, 
    Object endpoint_plugin_qos)
    {
        int position = 0;

        if (skip_encapsulation) {
            src.skipEncapsulation();

            position = src.resetAlignment();
        }

        if (skip_sample) {

            rapid.MessageTypeSupport.get_instance().skip(endpoint_data, src, false, true, endpoint_plugin_qos);
            src.skipString();

            src.skipBoolean();

            rapid.ext.astrobee.SaveSettingSequence64TypeSupport.get_instance().skip(endpoint_data, src, false, true, endpoint_plugin_qos);

        }

        if (skip_encapsulation) {
            src.restoreAlignment(position);
        }
    }

    public Object serialized_sample_to_key(
        Object endpoint_data,
        Object sample,
        CdrInputStream src, 
        boolean deserialize_encapsulation,  
        boolean deserialize_key, 
        Object endpoint_plugin_qos) 
    {

        int position = 0;

        if(deserialize_encapsulation) {
            src.deserializeAndSetCdrEncapsulation();

            position = src.resetAlignment();
        }

        if (deserialize_key) {

            DataToDiskState typedDst = (DataToDiskState) sample;

            rapid.MessageTypeSupport.get_instance().serialized_sample_to_key(endpoint_data,sample,
            src,false, true,
            endpoint_plugin_qos);

            src.skipString();

            src.skipBoolean();

            rapid.ext.astrobee.SaveSettingSequence64TypeSupport.get_instance().skip(endpoint_data, src, false, true, endpoint_plugin_qos);

        }

        if (deserialize_encapsulation) {
            src.restoreAlignment(position);
        }

        return sample;
    }

    /* Fill in the key fields of the given instance sample based on the key.
    */
    public void key_to_instance(Object endpoint_data,
    Object instance,
    Object key) {
        DataToDiskState typedDst
        = (DataToDiskState) instance;
        DataToDiskState typedSrc
        = (DataToDiskState) key;
        rapid.MessageTypeSupport.get_instance().key_to_instance(endpoint_data,instance,key);

    }

    /* Fill in the given key based on the key fields of the given instance
    * sample.
    */
    public void instance_to_key(Object endpoint_data,
    Object key,
    Object instance) {
        DataToDiskState typedDst
        = (DataToDiskState)key;
        DataToDiskState typedSrc
        = (DataToDiskState) instance;
        rapid.MessageTypeSupport.get_instance().instance_to_key(endpoint_data,key,instance);

    }

    public void serialized_sample_to_keyhash(
        Object endpoint_data,
        CdrInputStream src,
        KeyHash_t keyhash,
        boolean include_encapsulation,
        Object endpoint_plugin_qos)
    {
        int position = 0;

        DefaultEndpointData endpointData = (DefaultEndpointData) endpoint_data;
        Object sample = null;

        sample = endpointData.get_sample();

        if (sample == null) {
            throw new RETCODE_ERROR("Missing intermediate sample");
        }

        DataToDiskState typedDst = (DataToDiskState) sample;

        if (include_encapsulation) {
            src.deserializeAndSetCdrEncapsulation();

            position = src.resetAlignment();
        }
        rapid.MessageTypeSupport.get_instance().serialized_sample_to_key(endpoint_data,sample,
        src, false, true,
        endpoint_plugin_qos);

        if (include_encapsulation) {
            src.restoreAlignment(position);
        }

        instance_to_keyhash(endpoint_data, keyhash, sample);
    }

    // -----------------------------------------------------------------------
    // Callbacks
    // -----------------------------------------------------------------------
    public Object on_participant_attached(Object registration_data,
    TypeSupportParticipantInfo participant_info,
    boolean top_level_registration,
    Object container_plugin_context,
    TypeCode type_code) {
        return super.on_participant_attached(
            registration_data, participant_info, top_level_registration,
            container_plugin_context, type_code);
    }

    public void on_participant_detached(Object participant_data) {
        super.on_participant_detached(participant_data);
    }

    public Object on_endpoint_attached(Object participantData,
    TypeSupportEndpointInfo endpoint_info,
    boolean top_level_registration,
    Object container_plugin_context) {
        return super.on_endpoint_attached(
            participantData,  endpoint_info,  
            top_level_registration, container_plugin_context);        
    }

    public void on_endpoint_detached(Object endpoint_data) {
        super.on_endpoint_detached(endpoint_data);
    }
    // -----------------------------------------------------------------------
    // Protected Methods
    // -----------------------------------------------------------------------

    protected DataWriter create_datawriter(long native_writer,
    DataWriterListener listener,
    int mask) {
        return new DataToDiskStateDataWriter (native_writer, listener, mask, this);            
    }

    protected DataReader create_datareader(long native_reader,
    DataReaderListener listener,
    int mask) {

        return new DataToDiskStateDataReader(native_reader, listener, mask, this);   

    }

    // -----------------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------------

    protected DataToDiskStateTypeSupport() {

        /* If the user data type supports keys, then the second argument
        to the constructor below should be true.  Otherwise it should
        be false. */        

        super(TYPE_NAME,true,DataToDiskStateTypeCode.VALUE,DataToDiskState.class,TypeSupportType.TST_STRUCT, PLUGIN_VERSION);

    }

    protected DataToDiskStateTypeSupport (boolean enableKeySupport) {

        super(TYPE_NAME, enableKeySupport,DataToDiskStateTypeCode.VALUE,DataToDiskState.class,TypeSupportType.TST_STRUCT, PLUGIN_VERSION);
    }
}

