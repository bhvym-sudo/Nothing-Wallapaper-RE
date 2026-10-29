.class public final LN8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN8/g;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lv8/q;

.field private final c:Lv8/q;

.field private final d:Lv8/q;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lv8/q;Lv8/q;Lv8/q;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN8/h;->a:Ljava/lang/Object;

    iput-object p2, p0, LN8/h;->b:Lv8/q;

    iput-object p3, p0, LN8/h;->c:Lv8/q;

    iput-object p4, p0, LN8/h;->d:Lv8/q;

    return-void
.end method


# virtual methods
.method public a()Lv8/q;
    .registers 1

    iget-object p0, p0, LN8/h;->b:Lv8/q;

    return-object p0
.end method

.method public b()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LN8/h;->a:Ljava/lang/Object;

    return-object p0
.end method

.method public c()Lv8/q;
    .registers 1

    iget-object p0, p0, LN8/h;->d:Lv8/q;

    return-object p0
.end method

.method public d()Lv8/q;
    .registers 1

    iget-object p0, p0, LN8/h;->c:Lv8/q;

    return-object p0
.end method
