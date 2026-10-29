.class public final synthetic LJ7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:LC7/b;


# direct methods
.method public synthetic constructor <init>(LC7/b;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ7/j;->q:LC7/b;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LJ7/j;->q:LC7/b;

    check-cast p1, LC7/b;

    invoke-static {p0, p1}, LJ7/i$s;->s(LC7/b;LC7/b;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
