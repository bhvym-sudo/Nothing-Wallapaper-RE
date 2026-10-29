.class final LI8/M;
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
    .registers 3

    new-instance p0, LI8/M$a;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LI8/M$a;-><init>(LI8/O;Lm8/e;)V

    invoke-static {p0}, LI8/h;->A(Lv8/p;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "SharingStarted.Lazily"

    return-object p0
.end method
