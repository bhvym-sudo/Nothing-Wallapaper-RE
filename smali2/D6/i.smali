.class public final synthetic LD6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LD6/k;


# direct methods
.method public synthetic constructor <init>(LD6/k;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/i;->q:LD6/k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LD6/i;->q:LD6/k;

    invoke-static {p0}, LD6/k;->b(LD6/k;)LD6/t;

    move-result-object p0

    return-object p0
.end method
