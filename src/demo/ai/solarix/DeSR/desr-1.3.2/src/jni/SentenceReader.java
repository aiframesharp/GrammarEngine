/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jni;

public class SentenceReader extends EnumeratorSentence {
  private long swigCPtr;

  protected SentenceReader(long cPtr, boolean cMemoryOwn) {
    super(desrJNI.SWIGSentenceReaderUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SentenceReader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        desrJNI.delete_SentenceReader(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SentenceReader(SWIGTYPE_p_std__istream is, Corpus corpus) {
    this(desrJNI.new_SentenceReader(SWIGTYPE_p_std__istream.getCPtr(is), Corpus.getCPtr(corpus), corpus), true);
  }

  public boolean MoveNext() {
    return desrJNI.SentenceReader_MoveNext(swigCPtr, this);
  }

  public Sentence Current() {
    long cPtr = desrJNI.SentenceReader_Current(swigCPtr, this);
    return (cPtr == 0) ? null : new Sentence(cPtr, false);
  }

}
