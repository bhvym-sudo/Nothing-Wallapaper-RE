.class public final synthetic LJ7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:LJ7/i;


# direct methods
.method public synthetic constructor <init>(LJ7/i;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ7/g;->q:LJ7/i;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LJ7/g;->q:LJ7/i;

    check-cast p1, LC7/b;

    invoke-static {p0, p1}, LJ7/i;->j(LJ7/i;LC7/b;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
