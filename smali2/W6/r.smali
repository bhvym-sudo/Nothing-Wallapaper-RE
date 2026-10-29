.class public final synthetic LW6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:LW6/x;


# direct methods
.method public synthetic constructor <init>(LW6/x;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/r;->q:LW6/x;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LW6/r;->q:LW6/x;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p0, p1}, LW6/x;->U0(LW6/x;F)Lh8/A;

    move-result-object p0

    return-object p0
.end method
