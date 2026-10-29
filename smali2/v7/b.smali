.class public final Lv7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LI8/A;

.field private final b:LI8/O;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object v0

    iput-object v0, p0, Lv7/b;->a:LI8/A;

    invoke-static {v0}, LI8/h;->b(LI8/A;)LI8/O;

    move-result-object v0

    iput-object v0, p0, Lv7/b;->b:LI8/O;

    return-void
.end method


# virtual methods
.method public final a()LI8/O;
    .registers 1

    iget-object p0, p0, Lv7/b;->b:LI8/O;

    return-object p0
.end method

.method public final b(Z)V
    .registers 2

    iget-object p0, p0, Lv7/b;->a:LI8/A;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void
.end method
