.class public final synthetic Lx6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Lx6/k;


# direct methods
.method public synthetic constructor <init>(Lx6/k;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/i;->q:Lx6/k;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, Lx6/i;->q:Lx6/k;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p0, p1}, Lx6/k;->b(Lx6/k;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method
