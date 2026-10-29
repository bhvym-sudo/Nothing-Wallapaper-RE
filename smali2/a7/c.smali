.class public final synthetic La7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:La7/d;


# direct methods
.method public synthetic constructor <init>(La7/d;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La7/c;->q:La7/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, La7/c;->q:La7/d;

    invoke-static {p0}, La7/d;->f(La7/d;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
