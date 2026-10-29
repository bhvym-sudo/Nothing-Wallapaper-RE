.class public final LF8/f;
.super LF8/i0;
.source "SourceFile"


# instance fields
.field private final y:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .registers 2

    invoke-direct {p0}, LF8/i0;-><init>()V

    iput-object p1, p0, LF8/f;->y:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method protected x1()Ljava/lang/Thread;
    .registers 1

    iget-object p0, p0, LF8/f;->y:Ljava/lang/Thread;

    return-object p0
.end method
