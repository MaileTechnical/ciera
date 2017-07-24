package ciera.classes;

import java.util.UUID;

import ciera.classes.exceptions.EmptyInstanceException;
import ciera.classes.exceptions.ModelIntegrityException;
import ciera.statemachine.AssignerStateMachine;
import ciera.statemachine.Event;
import ciera.statemachine.EventDispatch;
import ciera.statemachine.EventTarget;
import ciera.statemachine.InstanceStateMachine;
import ciera.statemachine.exceptions.StateMachineException;

public abstract class ModelInstance implements EventTarget {
    
    private UUID instanceId;
    private boolean alive;

    private EventDispatch dispatch;
    protected InstanceStateMachine ism;
    protected AssignerStateMachine asm;
    
    public ModelInstance() {
        instanceId = UUID.randomUUID();
        alive = true;
    }

    public abstract int getClassId();
    
    public UUID getInstanceId() {
        return instanceId;
    }
    
    public void checkLiving() throws EmptyInstanceException {
        if ( !alive ) throw new EmptyInstanceException( "Access of deleted instance " );
    }
    
    @Override
    public void transition( Event e ) throws StateMachineException, EmptyInstanceException, ModelIntegrityException {
        checkLiving();
        ism.transition(e);
    }
    
    @Override
    public void generateTo( Event e ) throws EmptyInstanceException {
        checkLiving();
        e.setTarget( this );
        dispatch.generateTo( e );
    }

    @Override
    public void generateToSelf( Event e ) throws EmptyInstanceException {
        e.setToSelf( true );
        generateTo( e );
    }
    
    @Override
    public void run() {
        dispatch.run();
    }
    
    public void delete() throws EmptyInstanceException {
        checkLiving();
        alive = false;
    }
    
    @Override
    public boolean equals( Object obj ) {
        if ( !(obj instanceof ModelInstance ) ) return false;
        return ((ModelInstance)obj).getInstanceId().equals(instanceId);
    }

}
