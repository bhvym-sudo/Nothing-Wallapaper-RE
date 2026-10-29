.class public final synthetic LW6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Lv8/l;


# direct methods
.method public synthetic constructor <init>(Lv8/l;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/h;->q:Lv8/l;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LW6/h;->q:Lv8/l;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p0, p1}, LW6/i;->f0(Lv8/l;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method
