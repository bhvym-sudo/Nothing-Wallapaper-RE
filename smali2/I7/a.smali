.class public final LI7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LJ7/i;


# direct methods
.method public constructor <init>(LJ7/i;)V
    .registers 3

    const-string v0, "lockScreenViewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/a;->a:LJ7/i;

    return-void
.end method


# virtual methods
.method public final a()Z
    .registers 1

    iget-object p0, p0, LI7/a;->a:LJ7/i;

    invoke-virtual {p0}, LJ7/i;->o0()Z

    move-result p0

    return p0
.end method

.method public final b()V
    .registers 1

    iget-object p0, p0, LI7/a;->a:LJ7/i;

    invoke-virtual {p0}, LJ7/i;->z0()V

    return-void
.end method

.method public final c()V
    .registers 1

    iget-object p0, p0, LI7/a;->a:LJ7/i;

    invoke-virtual {p0}, LJ7/i;->C0()V

    return-void
.end method
