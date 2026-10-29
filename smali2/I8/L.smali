.class final LI8/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/K;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI8/O;)LI8/f;
    .registers 2

    sget-object p0, LI8/I;->q:LI8/I;

    invoke-static {p0}, LI8/h;->C(Ljava/lang/Object;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "SharingStarted.Eagerly"

    return-object p0
.end method
